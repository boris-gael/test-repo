node {
    stage('clone') {
        git branch: 'develop', credentialsId: '7a247e8d-c935-4494-bb18-185b84a1cf25', url: 'https://github.com/boris-gael/test-repo.git'
    }
    stage('build') {
        bat 'javac Main.java'
    }
    stage('run') {
        bat 'java Main'
    }
}