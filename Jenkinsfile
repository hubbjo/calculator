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
				sh "./mvnw verify"
            }
        }
		 stage("Code coverage Report") {
		     steps {
		          sh "./mvnw check"
		          publishHTML (target: [
		               reportDir: 'build/reports/jacoco/test/html',
		               reportFiles: 'index.html',
		               reportName: "JaCoCo Report"
		          ])
		     }
         }
     }
}