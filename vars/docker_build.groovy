def call(String img_name, String img_tag){
    sh "docker build -t ${img_name}:${img_tag} ."
}