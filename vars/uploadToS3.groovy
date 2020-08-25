import global.coda.utils.Helper

def call(String credentialsId, String bucketName, String folderToUpload){
  Helper.uploadToS3(credentialsId, bucketName, folderToUpload)
}
