def clone(String repoUrl) {
    sh "git clone ${repoUrl}"
}

def call(Map params) {
    // You can access the KEEP_APPROVAL_STAGE parameter from the Jenkinsfile
    def approvalRequired = params.KEEP_APPROVAL_STAGE ?: "true"

    if (approvalRequired == "true") {
        echo "Approval stage is required."
        // Add your approval stage logic here
    } else {
        echo "Skipping approval stage."
    }
}

// def approve(Map config) {
//     timeout(time: 30, unit: 'MINUTES') {
      
//         def userInput = input(
//             id: 'userInput',
//             message: 'Do you want to proceed with the build?',
//             parameters: [choice(name: 'APPROVE', choices: 'Approve\nReject', description: 'Choose approval status')]
//         )

      
//         if (userInput == 'Approve') {
//             echo 'User approved the build.'
          
//         } else {
//             error('User rejected the build.')
//         }
//     }
// }
