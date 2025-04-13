/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$createTokenCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$createTokenRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.Token
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.AccountApi;
import com.ankama.haapi.client.okhttp.ankama.model.Token;
import com.ankamagames.wakfu.client.WakfuClient;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

@ChannelHandler.Sharable
public class bcB
extends SimpleChannelInboundHandler<bcQ> {
    private static final Logger e = Logger.getLogger(bcB.class);
    public static final long a = 99L;
    public static final int b = 2;
    public static final int c = 3;
    public static final String d = "WakfuUser";

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.writeAndFlush((Object)new bcR(1));
    }

    protected void a(ChannelHandlerContext channelHandlerContext, bcQ bcQ2) {
        AccountApi.createTokenRequest createTokenRequest2 = AccountApi.createTokenRequest().game(Long.valueOf(99L));
        AccountApi.createTokenCallback createTokenCallback2 = AccountApi.createTokenCallback().on200(apiResponse -> bcB.a((Token)apiResponse.getData(), channelHandlerContext.channel())).onDefault(apiResponse -> e.error((Object)("[CHAT] Error " + apiResponse.getStatusCode() + " requesting Chat token : " + (String)apiResponse.getData()))).onException(throwable -> e.error((Object)"[CHAT] Error requesting Chat token", throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)createTokenRequest2, (ApiCallback.Callback)createTokenCallback2);
    }

    private static void a(Token token, Channel channel) {
        String string = token.getToken();
        bcN bcN2 = new bcN();
        bcN2.a(string);
        bcN2.a(2);
        bcN2.b(ahu_2.a().f());
        bcN2.c(3);
        bcN2.b(azm_0.a().orElse(d));
        bcN2.c("");
        channel.writeAndFlush((Object)bcN2);
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (bcQ)object);
    }
}

