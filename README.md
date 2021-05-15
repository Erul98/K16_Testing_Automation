# K16_Testing_Automation
Testing Automation using Katalon tool
## Setup Mattermost application to execute testing automation
### Setup Mattermost Server
* ##### Install [Docker](https://docs.docker.com/docker-for-mac/)
* ##### Download and Install [homebrew](https://brew.sh/)
* ##### Install Go 
> brew install go
* ##### Setup enviroment for Go
> Run command: ls -la 
Check file .bash_profile
Create or open .bash_profile
Copy and pass inside .bash_profile
export GOPATH=$HOME/go
export PATH=$PATH:$GOPATH/bin
ulimit -n 8096
* ##### Check Go version target 1.13+
> Run command: go version
* ##### Build server
> Run command: cd PATH/mattermost-server-5.35.0
> Run command: make run-server
* ##### Check server is running
> http://localhost:8065/api/v4/system/ping
Done: {"AndroidLatestVersion":"","AndroidMinVersion":"","DesktopLatestVe
rsion":"","DesktopMinVersion":"","IosLatestVersion":"","IosMinVers
ion":"","status":"OK"}
### Setup Mattermost Client
* ##### Install Nodejs: Node v10.15.3+ and npm v6.4.1+
> Run command: brew install node@10 libpng
* ##### Install libraries and test environment
> Run command: make test 
* ##### Build webapp
> make build
