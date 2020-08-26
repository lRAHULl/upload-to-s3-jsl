import global.coda.utils.Helper

def call(String result) {
  String color = Helper.slackSendStatus(result)
  if (color == '') {
    color = 'danger'
    result = 'unclear'
  } 
  slackSend color: "${color}", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was ${result}"
}