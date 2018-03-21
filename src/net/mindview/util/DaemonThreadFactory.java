package net.mindview.util;

import java.util.concurrent.ThreadFactory;

/**
 * Created on 2018/3/21.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
