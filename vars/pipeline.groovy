import io.jenkins.plugins.KafkaProducerMessage
def call(body){

    def message = "Hello World!"
    KafkaProducerMessage kafka = new KafkaProducerMessage("kafka:9091","teste")
    kafka.produce("Mensagem de teste")


    pipeline {

        stages {
            stage('Build') {
                steps {

                    echo 'Building..'
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Print Message') {
                steps {
                    echo message
                }
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
    }
}

return this