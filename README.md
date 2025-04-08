# Jenkins-Pipeline-Repo

Task : Host a website in nginx in docker and auto-update on any push in github

Step-1 : Follow EC2-instance-info.txt

Step-2 : Add Shared libraray info to jenkins
    > follow file "Add-Shared-Library-In-Jenkins.txt"

Step-3 : Go to jenkins --> New Item --> Pipeline
    > Enable - GitHub project (paste link - https://github.com/Harshit-Shukla-05/Jenkins-Pipeline-Repo.git)
    > Enable - GitHub hook trigger for GITScm polling
    > Pipeline - select "pipeline script from scm"


