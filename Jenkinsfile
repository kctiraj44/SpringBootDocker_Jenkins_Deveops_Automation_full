pipeline {

    agent any
    tools{
        maven 'maven_3_8_2'

    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kctiraj44/SpringBootDocker_Jenkins_Deveops_Automation_full']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t kctiraj44/devops-automation .'
                }
            }
        }
        stage('Push docker image to hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'docker hub-pwd', variable: 'dockerhubpwd')]) {
                   sh 'docker login -u kctiraj44 -p ${dockerhubpwd}'
}
                   sh 'docker push kctiraj44/devops-automation'
                }
            }
        }
    }
}