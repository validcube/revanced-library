package app.revanced.library.installation.command

/**
 * The result of a command execution.
 */
interface RunResult {
    /**
     * The exit code of the command.
     */
    val exitCode: Int

    /**
     * The output of the command.
     */
    val output: List<String>

    /**
     * The error output of the command.
     */
    val error: List<String>

    /**
     * Waits for the command to finish.
     */
    fun waitFor(): Int
}
