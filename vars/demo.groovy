def clone(String repoUrl) {
    sh "git clone ${repoUrl}"
}
def approve() {
    timeout(time: 30, unit: 'MINUTES') {
        // Request user approval with a custom message
        def userInput = input(
            id: 'userInput',
            message: 'Do you want to proceed with the build?',
            parameters: [choice(name: 'APPROVE', choices: 'Approve\nReject', description: 'Choose approval status')]
        )

        // Check if the user approved or rejected
        if (userInput == 'Approve') {
            echo 'User approved the build.'
            // Proceed with the build
        } else {
            error('User rejected the build.')
        }
    }
}
