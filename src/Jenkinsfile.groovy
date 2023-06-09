pipeline {
    agent any
    stages {
        stage('准备') {
            steps {
                // 准备阶段的步骤，例如清理构建环境、安装依赖等
            }
        }
        stage('构建') {
            steps {
                // 构建步骤，例如执行Maven命令、编译代码等
            }
        }
        stage('测试') {
            steps {
                // 测试步骤，例如执行单元测试、集成测试等
            }
        }
        stage('部署') {
            steps {
                // 部署步骤，例如将构建结果部署到服务器等
            }
        }
    }
}
