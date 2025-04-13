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

public final class j
extends GeneratedMessageV3
implements u_0 {
    private static final long f = 0L;
    public static final int a = 1;
    volatile Object g;
    public static final int b = 2;
    volatile Object h;
    public static final int c = 3;
    long i;
    public static final int d = 4;
    volatile Object j;
    public static final int e = 5;
    cd_2 k;
    private byte l = (byte)-1;
    private static final j m = new j();
    static final Parser<j> n = new k_0();

    j(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private j() {
        this.g = "";
        this.h = "";
        this.i = 0L;
        this.j = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                Object object;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block14;
                        bl2 = true;
                        continue block14;
                    }
                    case 10: {
                        this.g = object = codedInputStream.readStringRequireUtf8();
                        continue block14;
                    }
                    case 18: {
                        this.h = object = codedInputStream.readStringRequireUtf8();
                        continue block14;
                    }
                    case 24: {
                        this.i = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 34: {
                        this.j = object = codedInputStream.readStringRequireUtf8();
                        continue block14;
                    }
                    case 42: 
                }
                object = null;
                if (this.k != null) {
                    object = this.k.i();
                }
                this.k = (cd_2)codedInputStream.readMessage(cd_2.k(), extensionRegistryLite);
                if (object == null) continue;
                ((cf_2)object).a(this.k);
                this.k = ((cf_2)object).j();
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
        return g_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.h.ensureFieldAccessorsInitialized(j.class, l_0.class);
    }

    @Override
    public String b() {
        Object object = this.g;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.g = string;
        return string;
    }

    @Override
    public ByteString c() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public String d() {
        Object object = this.h;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.h = string;
        return string;
    }

    @Override
    public ByteString e() {
        Object object = this.h;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.h = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public long f() {
        return this.i;
    }

    @Override
    public String g() {
        Object object = this.j;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.j = string;
        return string;
    }

    @Override
    public ByteString h() {
        Object object = this.j;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.j = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean i() {
        return this.k != null;
    }

    @Override
    public cd_2 j() {
        return this.k == null ? cd_2.j() : this.k;
    }

    @Override
    public cq_1 k() {
        return this.j();
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.g);
        }
        if (!this.e().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.h);
        }
        if (this.i != 0L) {
            codedOutputStream.writeInt64(3, this.i);
        }
        if (!this.h().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.j);
        }
        if (this.k != null) {
            codedOutputStream.writeMessage(5, (MessageLite)this.j());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!this.c().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.g);
        }
        if (!this.e().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.h);
        }
        if (this.i != 0L) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.i);
        }
        if (!this.h().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.j);
        }
        if (this.k != null) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.j());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof j)) {
            return super.equals(object);
        }
        j j2 = (j)object;
        boolean bl = true;
        bl = bl && this.b().equals(j2.b());
        bl = bl && this.d().equals(j2.d());
        bl = bl && this.f() == j2.f();
        bl = bl && this.g().equals(j2.g());
        boolean bl2 = bl = bl && this.i() == j2.i();
        if (this.i()) {
            bl = bl && this.j().equals(j2.j());
        }
        bl = bl && this.unknownFields.equals((Object)j2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + j.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b().hashCode();
        n = 37 * n + 2;
        n = 53 * n + this.d().hashCode();
        n = 37 * n + 3;
        n = 53 * n + Internal.hashLong((long)this.f());
        n = 37 * n + 4;
        n = 53 * n + this.g().hashCode();
        if (this.i()) {
            n = 37 * n + 5;
            n = 53 * n + this.j().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static j a(ByteBuffer byteBuffer) {
        return (j)n.parseFrom(byteBuffer);
    }

    public static j a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (j)n.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static j a(ByteString byteString) {
        return (j)n.parseFrom(byteString);
    }

    public static j a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (j)n.parseFrom(byteString, extensionRegistryLite);
    }

    public static j a(byte[] byArray) {
        return (j)n.parseFrom(byArray);
    }

    public static j a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (j)n.parseFrom(byArray, extensionRegistryLite);
    }

    public static j a(InputStream inputStream) {
        return (j)GeneratedMessageV3.parseWithIOException(n, (InputStream)inputStream);
    }

    public static j a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (j)GeneratedMessageV3.parseWithIOException(n, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static j b(InputStream inputStream) {
        return (j)GeneratedMessageV3.parseDelimitedWithIOException(n, (InputStream)inputStream);
    }

    public static j b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (j)GeneratedMessageV3.parseDelimitedWithIOException(n, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static j a(CodedInputStream codedInputStream) {
        return (j)GeneratedMessageV3.parseWithIOException(n, (CodedInputStream)codedInputStream);
    }

    public static j a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (j)GeneratedMessageV3.parseWithIOException(n, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public l_0 l() {
        return j.m();
    }

    public static l_0 m() {
        return m.n();
    }

    public static l_0 a(j j2) {
        return m.n().a(j2);
    }

    public l_0 n() {
        return this == m ? new l_0() : new l_0().a(this);
    }

    protected l_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        l_0 l_02 = new l_0(builderParent);
        return l_02;
    }

    public static j o() {
        return m;
    }

    public static Parser<j> p() {
        return n;
    }

    public Parser<j> getParserForType() {
        return n;
    }

    public j q() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(j j2) {
        return j2.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        j.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void c(ByteString byteString) {
        j.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void d(ByteString byteString) {
        j.checkByteStringIsUtf8((ByteString)byteString);
    }
}

