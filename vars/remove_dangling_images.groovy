def call(){
    sh "docker image prune -f"
    echo "--- Dangling Images Removed ---"
}