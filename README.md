## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Git Workflow

This repository is pushed to two GitHub accounts. To commit and push your changes:

1. **Stage your changes:**
   ```bash
   git add .
   ```

2. **Commit with a message:**
   ```bash
   git commit -m "Your commit message here"
   ```

3. **Push to both repositories:**
   ```bash
   gh auth switch --user israel2403 && git push israel2403 master && \
   gh auth switch --user m14011063 && git push m1401106 master
   ```

This will automatically push your changes to both:
- https://github.com/israel2403/FleetManagementSystem
- https://github.com/m14011063/FleetManagementSystem
