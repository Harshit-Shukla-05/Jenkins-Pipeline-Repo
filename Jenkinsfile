@Library("Shared") _
pipeline{
    agent {label "AGNode"}
    environment {
        GIT_REPO = 'https://github.com/Harshit-Shukla-05/Jenkins-Pipeline-Repo.git'
        GIT_BRANCH = 'simple_pipeline'
    }
    stages{
        stage("Greetings"){
            steps{
                script{
                    greetings()
                }
            }
        }
        stage("Clone Github Code"){
            steps{
                script{
                    github_clone("${GIT_REPO}","${GIT_BRANCH}" )
                }
            }
        }
        stage("Build - docker image"){
            steps{
                script{
                    docker_build("hello-world-image","latest")
                }
            }
        }
        stage("Push Img to dockerhub"){
            steps{
                echo "Need to write this code"
            }
        }
        stage("Deploy"){
            steps{
                script{
                    docker_compose_to_deploy()
                }
            }
        }
        stage("Clean Up"){
            steps{
                script{
                    remove_dangling_images()
                }
            }
        }
    }
}