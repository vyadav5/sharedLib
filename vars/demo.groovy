def clone(Map config) {
    def repoUrl = config.REPO_URL
    sh "git clone ${repoUrl}"
}

// def call(Map params) {
    
//     def approvalRequired = params.KEEP_APPROVAL_STAGE ?: "true"

//     if (approvalRequired == "true") {
//         echo "Approval stage is required."
        
//     } else {
//         echo "Skipping approval stage."
//     }
// }

// def approve(Map config) {
//     timeout() {
      
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
