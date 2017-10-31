package com.greenlionsoft.logx


object Logx {

    private lateinit var logger: ILogx

    fun setLogger(logger: ILogx) {
        this.logger = logger
    }

    //Debug
    fun d(tag: String, message: String) {
        if (logger.areLogsEnabled()) {
            logger.d(tag, message)
        }
    }

    fun d(message: String) {
        if (logger.areLogsEnabled()) {
            logger.d(message)
        }
    }

    fun d(enabledStatusOverride: Boolean, tag: String, message: String) {
        if (enabledStatusOverride) {
            logger.d(tag, message)
        }
    }

    fun d(enabledStatusOverride: Boolean, message: String) {
        if (enabledStatusOverride) {
            logger.d(message)
        }
    }

    //Verbose
    fun v(tag: String, message: String) {
        if (logger.areLogsEnabled()) {
            logger.v(tag, message)
        }
    }

    fun v(message: String) {
        if (logger.areLogsEnabled()) {
            logger.v(message)
        }
    }

    //info
    fun i(enabledStatusOverride: Boolean, tag: String, message: String) {
        if (enabledStatusOverride) {
            logger.i(tag, message)
        }
    }

    fun i(tag: String, message: String) {
        if (logger.areLogsEnabled()) {
            logger.i(tag, message)
        }
    }

    fun i(message: String) {
        if (logger.areLogsEnabled()) {
            logger.i(message)
        }
    }

    //warning
    fun w(tag: String, message: String) {
        if (logger.areLogsEnabled()) {
            logger.w(tag, message)
        }
    }

    fun w(message: String) {
        if (logger.areLogsEnabled()) {
            logger.w(message)
        }
    }

    //error
    fun e(tag: String, message: String) {
        if (logger.areLogsEnabled()) {
            logger.e(tag, message)
        }
    }

    fun e(enabledStatusOverride: Boolean, tag: String, message: String, e: Throwable) {
        if (enabledStatusOverride) {
            logger.e(tag, message, e)
        }
    }

    fun e(tag: String, message: String, e: Throwable) {
        if (logger.areLogsEnabled()) {
            logger.e(tag, message, e)
        }
    }

    fun e(message: String) {
        if (logger.areLogsEnabled()) {
            logger.e(message)
        }
    }

    fun e(message: String, e: Throwable) {
        if (logger.areLogsEnabled()) {
            logger.e(message, e)
        } else {
            logger.reportException(e)
        }
    }

    fun reportException(e: Throwable) {
        logger.reportException(e)
    }

}