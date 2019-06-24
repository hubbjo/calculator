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
		 stage("Code coverage Report") {
		     steps {
		          sh "./mvnw jacoco:report"
		          publishHTML (target: [
		               reportDir: 'target/site/jacoco',
		               reportFiles: 'index.html',
		               reportName: "JaCoCo Report"
		          ])
		          sh "./mvnw verify"
		     }
         }
     }
}