pipeline {
     agent any
     triggers {
	     pollSCM('* * * * *')
	}
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
		               reportName: "Code Coverage Report"
		          ])
		          sh "./mvnw verify"
		     }
         }
     }
}