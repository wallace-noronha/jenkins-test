import io.jenkins.plugins.KafkaProducerMessage

agent none
node {
    stage('Build') {
        KafkaProducerMessage kafka = new KafkaProducerMessage("kafka:9091", "teste")
        kafka.produce("Mensagem de teste")
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