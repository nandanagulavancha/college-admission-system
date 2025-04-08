pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                sh 'javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. src/main/com/example/admissionservice/AdmissionService.java src/test/com/example/admissionservice/AdmissionServiceTest.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore com.example.admissionservice.AdmissionServiceTest'
            }
        }
    }
}
