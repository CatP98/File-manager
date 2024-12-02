# File-manager
# File Manager Project

## **Overview**
A simple Java-based file manager with a text-based user interface for managing files and directories. It allows users to perform basic file operations such as listing contents, creating directories, and deleting files or directories.

---

## **Features**
- ✅ List contents of a directory.
- ✅ Create new directories.
- ✅ Delete files or directories.

---

## **Planned Improvements**
We are working on improving the codebase and adding new features. Below is a checklist of planned enhancements:

### **Code Improvements**
- [ ] **Decouple components**:
    - Refactor the `TextBasedInterface` class to use dependency injection for `UIEventHandler`.
    - Create a `Controller` class to manage communication between the user interface and file operations.
    - Define a `FileOperations` interface to standardize operations and allow easier testing or replacement of the `FileManager` class.
- [ ] **Improve error handling**:
    - Add descriptive error messages for invalid paths and failed operations.
    - Implement retries or recovery mechanisms for common errors.

### **New Features**

- [ ] **File content creation**:
    - Enhance the `createFile` method to allow writing initial content to the file.
- [ ] **Rename and move files**:
    - Add functionality to rename or move files and directories.
- [ ] **View file details**:
    - Show detailed information such as size, creation date, and permissions.

### **Documentation Enhancements**
- [ ] **Detailed usage instructions**:
    - Add a step-by-step guide to compiling and running the application.
- [ ] **Features list**:
    - Include explanations and examples for all supported features.
- [ ] **Code structure overview**:
    - Provide a description of the project's architecture and responsibilities of each component.
- [ ] **Contribution guidelines**:
    - Include a [CONTRIBUTING.md](CONTRIBUTING.md) file to guide contributors on code style, pull request processes, and testing.

### **User Experience (UX) Improvements**
- [ ] **Interactive menu redesign**:
    - Allow users to return to the main menu after performing an action instead of exiting.
    - Add a "Help" option to explain menu choices.
- [ ] **Confirmation prompts**:
    - Ask for confirmation before deleting files or directories to avoid accidental data loss.
- [ ] **Error feedback**:
    - Provide more detailed and helpful messages for invalid inputs or failures.

### **Future Enhancements**
- [ ] **Graphical User Interface (GUI)**:
    - Create a GUI version of the file manager using JavaFX or Swing.
