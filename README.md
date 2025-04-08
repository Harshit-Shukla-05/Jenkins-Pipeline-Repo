# Jenkins-Pipeline-Repo

This repository demonstrates how to set up a CI/CD pipeline in Jenkins to deploy a website using NGINX in a Docker container. The pipeline auto-updates the website whenever there is a push to the GitHub repository.

## Steps to Set Up

### Step 1: Set up the EC2 Instance
Follow the instructions in the `EC2-instance-info.txt` file to provision and configure an EC2 instance. This instance will host Jenkins and run the pipeline.

Note : use name "AGNode" as label in Jenkins while steuping node

### Step 2: Add Shared Library to Jenkins
To enable Jenkins to use shared libraries, follow the instructions in the `Add-Shared-Library-In-Jenkins.txt` file.

### Step 3: Configure Jenkins Pipeline
1. **Create a New Jenkins Pipeline Job:**
   - Go to Jenkins dashboard, then click on **New Item**.
   - Name the job, and select **Pipeline**.
   - Enable **GitHub project** and paste the following link:  
     `https://github.com/Harshit-Shukla-05/Jenkins-Pipeline-Repo.git`
   - Enable **GitHub hook trigger for GITScm polling** to trigger builds on every push to the GitHub repository. (work only with github web-hook)

2. **Pipeline Script Configuration:**
   - Choose **Pipeline script from SCM**.
   - Configure the repository:
     - **Repository URL**: `https://github.com/Harshit-Shukla-05/Jenkins-Pipeline-Repo.git`
     - **Credentials**: None (if required, add appropriate credentials)
     - **Branches to build**: Set **Branch Specifier** to `*/simple_pipeline`
     - **Script Path**: Set to `Jenkinsfile`

3. **Save the Job** and trigger a build.

## Step - 4 : to setup webhook from git
1. Go to Git Repo 
  - Go to Settings
  - left side select webhook
  - Add Webhook
    - Payload URL : http://<public_ip_of_master_EC2>:<jenkins_port>/github-webhook/     (Dont forget the "/" in the end)
    - Content type * : application/x-www-form-urlencoded
    - SSL Verification : Disable
    - Which events would you like to trigger this webhook? : Send me everything
    - Active : Tick
    - Click save

    NOTE : refresh and wait till the green tick comes in front of webhook , if failed try below method
        - refresh sometimes
        - goto recent deliver(appear when you open webhook) and redeliver
        - chage "Content type *" to application/json and save try , if not try once step 2
      
    NOTE : From jenkins side **GitHub hook trigger for GITScm polling**  already enabled, so it will automatically read.
