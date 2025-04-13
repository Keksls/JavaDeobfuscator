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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from m
 */
public final class m_0
extends GeneratedMessageV3
implements p {
    private static final long b = 0L;
    public static final int a = 1;
    j c;
    private byte d = (byte)-1;
    private static final m_0 e = new m_0();
    static final Parser<m_0> f = new n_0();

    m_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private m_0() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    m_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                l_0 l_02 = null;
                if (this.c != null) {
                    l_02 = this.c.n();
                }
                this.c = (j)codedInputStream.readMessage(j.p(), extensionRegistryLite);
                if (l_02 == null) continue;
                l_02.a(this.c);
                this.c = l_02.o();
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
        return g_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.f.ensureFieldAccessorsInitialized(m_0.class, o_0.class);
    }

    @Override
    public boolean b() {
        return this.c != null;
    }

    @Override
    public j c() {
        return this.c == null ? j.o() : this.c;
    }

    @Override
    public u_0 d() {
        return this.c();
    }

    public final boolean isInitialized() {
        byte by = this.d;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.d = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.c != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.c != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof m_0)) {
            return super.equals(object);
        }
        m_0 m_02 = (m_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == m_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(m_02.c());
        }
        bl = bl && this.unknownFields.equals((Object)m_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + m_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static m_0 a(ByteBuffer byteBuffer) {
        return (m_0)f.parseFrom(byteBuffer);
    }

    public static m_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (m_0)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static m_0 a(ByteString byteString) {
        return (m_0)f.parseFrom(byteString);
    }

    public static m_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (m_0)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static m_0 a(byte[] byArray) {
        return (m_0)f.parseFrom(byArray);
    }

    public static m_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (m_0)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static m_0 a(InputStream inputStream) {
        return (m_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static m_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (m_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static m_0 b(InputStream inputStream) {
        return (m_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static m_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (m_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static m_0 a(CodedInputStream codedInputStream) {
        return (m_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static m_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (m_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public o_0 e() {
        return m_0.f();
    }

    public static o_0 f() {
        return e.g();
    }

    public static o_0 a(m_0 m_02) {
        return e.g().a(m_02);
    }

    public o_0 g() {
        return this == e ? new o_0() : new o_0().a(this);
    }

    protected o_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        o_0 o_02 = new o_0(builderParent);
        return o_02;
    }

    public static m_0 h() {
        return e;
    }

    public static Parser<m_0> i() {
        return f;
    }

    public Parser<m_0> getParserForType() {
        return f;
    }

    public m_0 j() {
        return e;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(m_0 m_02) {
        return m_02.unknownFields;
    }
}

