package global.coda.utils

class Helper {

  // static void uploadToS3(String credentialsId, String bucketName, String folderToUpload){
  //   withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: "${credentialsId}", secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
  //     sh "aws s3 ls"
  //     sh 'ls'
  //     sh "aws s3 cp ${folderToUpload} s3://${bucketName} --recursive"
  //   }
  // }

  static String slackSendStatus(Sting result) {
    if ( result == "SUCCESS" ) {
      return "good"
    }
    else if( result == "FAILURE" ) { 
      return "danger"
    }
    else if( result == "UNSTABLE" ) { 
      return "warning"
    } else {
      return "danger"
    }
  }

}