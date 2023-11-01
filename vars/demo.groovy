def clone(String repoUrl) {
    sh "git clone ${repoUrl}"
}
def approve(String approvalMessage){
    slackSend(channel: 'slack-notify-jenkins', message: approvalMessage)
}
