package authentication;

import model.SocketWithUser;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;

/**
 * Created by sweet on 3/17/16.
 */
public class Authenticator {
    /*
     * TODO: 管理socket连接池与账户
     */

    private ArrayList<SocketWithUser> socketPools;

    public Authenticator() {
        socketPools = new ArrayList<SocketWithUser>();
    }

    public boolean addSocket(AsynchronousSocketChannel socketChannel) {
        /*
         * TODO: 添加一个Socket
         */


        return true;
    }

    public boolean deleteSocket(AsynchronousSocketChannel socketChannel) {
        /*
         * TODO: 删除一个Socket
         */

        return true;
    }

    public boolean addUser() {
        /*
         * TODO: 在数据库中添加用户
         */

        return true;
    }

    public boolean register(String username, String password) {
        /*
         * TODO: 在数据库中注册用户,password要使用md5加密
         */

        return true;
    }

    public boolean login(AsynchronousSocketChannel socketChannel, String username, String password) {
        /*
         * TODO: 为一个socket登陆
         */

        return true;
    }

    public void handleSend(AsynchronousSocketChannel socketChannel) {

    }


}
