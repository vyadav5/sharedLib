def setupCommonConfig() {
    def configFile = readFile('config')
    return readYaml text: configFile
}

def clone(Map config) {
    def repoUrl = config.REPO_URL
    sh "git clone ${repoUrl}"
}

def approvalStage(Map config) {
    def keepApprovalStage = config.KEEP_APPROVAL_STAGE ?: "false"  // set default value to false if null

    if (keepApprovalStage == "true") {
        echo "Approval stage is enabled."
        echo 'Build approved.'
        return true
    } else {
        echo 'Approval stage is disabled. Proceeding with the build.'
        return false
    }
}

