pipeline{
    agent any
    tools{
        jdk 'JDK21'
    }
    stages{
        stage('Cloning repository'){
            steps{
                git branch: 'main' , url: 'https://github.com/madhu143-rao/BPL.git'
            }
        }
        stage('Compile java'){
            steps{
                bat  'javac bpl_card.java'
            }
        }
        stage('run java'){
            steps{
                bat 'java bpl_card.java'
            }
        }
    }
}
