import io.jenkins.plugins.KafkaProducerMessage


pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                KafkaProducerMessage kafka = new KafkaProducerMessage("kafka:9091", "teste")
                kafka.produce("Mensagem de teste")
            }
        }
    }
}

//def call(body){
//
//    def message = "Hello World!"
//
//
//    pipeline {
//
//        stages {
//
//                steps {
//
//                    echo 'Building..'
//                }
//            }
//            stage('Test') {
//                steps {
//                    echo 'Testing..'
//                }
//            }
//            stage('Print Message') {
//                steps {
//                    echo message
//                }
//            }
//            stage('Deploy') {
//                steps {
//                    echo 'Deploying....'
//                }
//            }
//        }
//    }
//}
//
//return this