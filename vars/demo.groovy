// vars/demo.groovy
def call() {
    def config = libraryResource("resource/config.txt").read()

    // Access and print the configuration settings
    echo "SLACK_CHANNEL_NAME: ${config.SLACK_CHANNEL_NAME}"
    echo "ENVIRONMENT: ${config.ENVIRONMENT}"
    echo "CODE_BASE_PATH: ${config.CODE_BASE_PATH}"
    echo "KEEP_APPROVAL_STAGE: ${config.KEEP_APPROVAL_STAGE}"
}


// @Grab('org.json:json:20210307')
// import groovy.json.JsonSlurper

// def clone(Map config) {
//     def configFile = readFile('resources/config.json')
//     def parsedConfig = new JsonSlurper().parseText(configFile)


//     def repoUrl = config.REPO_URL
//     sh "git clone ${repoUrl}"
// }
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
