package com.trimetrica.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "git stah - to store uncommited changes";
        String step2 = "git checkout master - to move to local master branch";
        String step3 = "git fetch - to fetch the origin branches";
        String step4 = "git checkout -b new_branch - to create and instantly move to a new branch";
        String step5 = "Add your changes that related to the task";
        String step6 = "Review your changes and check your code before committing them";
        String step7 = "Execute git commit by using IntelliJ interface";
        String step8 = "Once all the changes are commited, execute a git push command by CTRL + ALT + K hot keys";
        String step9 = "The commited changes are pushed to an origin branch with the same name, navigate to GitHub branch";
        String step10 = "Create a Pull Request from origin/new_branch into origin/master";
        String step11 = "Add the Pull Request details - name, description and request review from your colleagues";
        String step12 = "If you collect at least 1 approval from your colleagues then merge the branch";
        String step13 = "If a change is required, then the last commit will be adjusted by using git commit amend";
        String step14 = "After that, the origin/master contains  the latest changes and the origin/new_branch can be deleted";
        String step15 = "Don't forget that locally you are still on the new_branch, it's good to move back to master";
        String step16 = "However, the local master branch does not have the lastest changes, therefore perform a git fetch and git pull";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
    }
}
