import global.coda.utils.Helper

def call(String credentialsId, String bucketName, String folderToUpload){
  withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: "${credentialsId}", secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
    sh "aws s3 ls"
    sh 'ls'
    sh "aws s3 cp ${folderToUpload} s3://${bucketName} --recursive"
  }
}