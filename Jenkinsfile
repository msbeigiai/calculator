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

        stage ("Code coverage") {
            steps {
                sh './gradlew jacocoTestReport'
                sh './gradlew jacocoTestCoverageVerification'
            }
        }
    }
}