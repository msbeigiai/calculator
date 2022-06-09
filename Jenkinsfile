pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew compileJava'
            }
        }
        stage("Unit test") {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew test'
            }
        }
    }
}