pipeline {
     agent any
     stages {
        stage("Compile") {
            steps {
                sh "chmod a+x ./mvnw"
                sh "./mvnw compile"
            }
        }
        stage("Test") {
            steps {
                sh "./mvnw test"
            }
        }
     }
}