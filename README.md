# First Assignment

## Requirements

- **Java JDK** (from Oracle)
- **Eclipse IDE** (Preferred) or any Java-compatible IDE

## Instructions

1. **Download the Project:**
   - You can either download the project as a zip file from GitHub or use the zip file provided in the attached document.

2. **Extract Files:**
   - Extract the contents of the zip file into your desired directory.
   - Example path:  
     `C:\Users\koti Reddy Seelam\Downloads\firstAssignment-main(1)\firstAssignment-main\firstAssignment`

3. **Import or Open the Project:**
   - **Using Eclipse:**  
     - Import the extracted project into Eclipse.
   - **Using Terminal/Command Line:**  
     - Open the terminal and change the directory to the location of the extracted project.
     - Example command to change directory:  
       `cd C:\Users\koti Reddy Seelam\Downloads\firstAssignment-main(1)\firstAssignment-main\firstAssignment`

4. **Run the Program:**
   - Execute the following command in the terminal:
     ```bash
     java -jar Sort.jar -t <type> -s <sorting_algorithm> -f <file_name>
     ```
     Replace the placeholders with valid inputs:
     - **`<type>`**:  
       - `a` (area)  
       - `v` (volume)  
       - `h` (height)
     - **`<sorting_algorithm>`**:  
       - `b` (Bubble Sort)  
       - `i` (Insertion Sort)  
       - `s` (Selection Sort)  
       - `q` (Quick Sort)  
       - `m` (Merge Sort)  
       - `z` (Custom Sort)
     - **`<file_name>`**:  
       - The file must be in the following format:  
         `res/<filename>.txt`
         
## Example Command

```bash
java -jar Sort.jar -ta -sq -f"res/sample".txt
