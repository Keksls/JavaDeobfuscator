/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from gW
 */
public final class gw_0
extends GeneratedMessageV3
implements gz_0 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    gp_2 g;
    private byte h = (byte)-1;
    private static final gw_0 i = new gw_0();
    @Deprecated
    public static final Parser<gw_0> c = new gx_0();

    gw_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gw_0() {
        this.f = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gw_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                gr_1 gr_12 = null;
                if ((this.e & 2) == 2) {
                    gr_12 = this.g.t();
                }
                this.g = (gp_2)codedInputStream.readMessage(gp_2.i, extensionRegistryLite);
                if (gr_12 != null) {
                    gr_12.a(this.g);
                    this.g = gr_12.u();
                }
                this.e |= 2;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return gn_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gn_1.f.ensureFieldAccessorsInitialized(gw_0.class, gy_0.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public gp_2 e() {
        return this.g == null ? gp_2.u() : this.g;
    }

    @Override
    public gs_1 f() {
        return this.g == null ? gp_2.u() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        if (!this.e().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gw_0)) {
            return super.equals(object);
        }
        gw_0 gw_02 = (gw_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == gw_02.b();
        if (this.b()) {
            bl = bl && this.c() == gw_02.c();
        }
        boolean bl3 = bl = bl && this.d() == gw_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(gw_02.e());
        }
        bl = bl && this.unknownFields.equals((Object)gw_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gw_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gw_0 a(ByteBuffer byteBuffer) {
        return (gw_0)c.parseFrom(byteBuffer);
    }

    public static gw_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gw_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gw_0 a(ByteString byteString) {
        return (gw_0)c.parseFrom(byteString);
    }

    public static gw_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gw_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static gw_0 a(byte[] byArray) {
        return (gw_0)c.parseFrom(byArray);
    }

    public static gw_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gw_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static gw_0 a(InputStream inputStream) {
        return (gw_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static gw_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gw_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gw_0 b(InputStream inputStream) {
        return (gw_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static gw_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gw_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gw_0 a(CodedInputStream codedInputStream) {
        return (gw_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static gw_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gw_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gy_0 g() {
        return gw_0.h();
    }

    public static gy_0 h() {
        return i.i();
    }

    public static gy_0 a(gw_0 gw_02) {
        return i.i().a(gw_02);
    }

    public gy_0 i() {
        return this == i ? new gy_0() : new gy_0().a(this);
    }

    protected gy_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        gy_0 gy_02 = new gy_0(builderParent);
        return gy_02;
    }

    public static gw_0 j() {
        return i;
    }

    public static Parser<gw_0> k() {
        return c;
    }

    public Parser<gw_0> getParserForType() {
        return c;
    }

    public gw_0 l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gw_0 gw_02) {
        return gw_02.unknownFields;
    }
}

