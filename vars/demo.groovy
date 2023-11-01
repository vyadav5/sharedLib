def cloneProjectRepo(repoUrl) {
    sh "git clone ${repoUrl}"
}

def repoUrl = 'https://github.com/vyadav5/ansible-newRelic.git' 
