# Jenkins-Pipeline-Repo

This repository demonstrates how to set up a CI/CD pipeline in Jenkins to deploy a website using NGINX in a Docker container. The pipeline auto-updates the website whenever there is a push to the GitHub repository.

## Steps to Set Up

### Step 1: Set up the EC2 Instance
Follow the instructions in the `EC2-instance-info.txt` file to provision and configure an EC2 instance. This instance will host Jenkins and run the pipeline.

### Step 2: Add Shared Library to Jenkins
To enable Jenkins to use shared libraries, follow the instructions in the `Add-Shared-Library-In-Jenkins.txt` file.

### Step 3: Configure Jenkins Pipeline
1. **Create a New Jenkins Pipeline Job:**
   - Go to Jenkins dashboard, then click on **New Item**.
   - Name the job, and select **Pipeline**.
   - Enable **GitHub project** and paste the following link:  
     `https://github.com/Harshit-Shukla-05/Jenkins-Pipeline-Repo.git`
   - Enable **GitHub hook trigger for GITScm polling** to trigger builds on every push to the GitHub repository.

2. **Pipeline Script Configuration:**
   - Choose **Pipeline script from SCM**.
   - Configure the repository:
     - **Repository URL**: `https://github.com/Harshit-Shukla-05/Jenkins-Pipeline-Repo.git`
     - **Credentials**: None (if required, add appropriate credentials)
     - **Branches to build**: Set **Branch Specifier** to `*/simple_pipeline`
     - **Script Path**: Set to `Jenkinsfile`

3. **Save the Job** and trigger a build.