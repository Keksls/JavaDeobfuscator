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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from q
 */
public final class q_0
extends GeneratedMessageV3
implements t_0 {
    private static final long b = 0L;
    public static final int a = 1;
    List<j> c;
    private byte d = (byte)-1;
    private static final q_0 e = new q_0();
    static final Parser<q_0> f = new r();

    q_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private q_0() {
        this.c = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    q_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                if (!(bl & true)) {
                    this.c = new ArrayList<j>();
                    bl |= true;
                }
                this.c.add((j)codedInputStream.readMessage(j.p(), extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.c = Collections.unmodifiableList(this.c);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return g_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.j.ensureFieldAccessorsInitialized(q_0.class, s.class);
    }

    @Override
    public List<j> b() {
        return this.c;
    }

    @Override
    public List<? extends u_0> c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.c.size();
    }

    @Override
    public j a(int n) {
        return this.c.get(n);
    }

    @Override
    public u_0 b(int n) {
        return this.c.get(n);
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
        for (int k = 0; k < this.c.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.c.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.c.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof q_0)) {
            return super.equals(object);
        }
        q_0 q_02 = (q_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(q_02.b());
        bl = bl && this.unknownFields.equals((Object)q_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + q_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static q_0 a(ByteBuffer byteBuffer) {
        return (q_0)f.parseFrom(byteBuffer);
    }

    public static q_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (q_0)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static q_0 a(ByteString byteString) {
        return (q_0)f.parseFrom(byteString);
    }

    public static q_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (q_0)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static q_0 a(byte[] byArray) {
        return (q_0)f.parseFrom(byArray);
    }

    public static q_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (q_0)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static q_0 a(InputStream inputStream) {
        return (q_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static q_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (q_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static q_0 b(InputStream inputStream) {
        return (q_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static q_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (q_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static q_0 a(CodedInputStream codedInputStream) {
        return (q_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static q_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (q_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public s e() {
        return q_0.f();
    }

    public static s f() {
        return e.g();
    }

    public static s a(q_0 q_02) {
        return e.g().a(q_02);
    }

    public s g() {
        return this == e ? new s() : new s().a(this);
    }

    protected s a(GeneratedMessageV3.BuilderParent builderParent) {
        s s2 = new s(builderParent);
        return s2;
    }

    public static q_0 h() {
        return e;
    }

    public static Parser<q_0> i() {
        return f;
    }

    public Parser<q_0> getParserForType() {
        return f;
    }

    public q_0 j() {
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

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(q_0 q_02) {
        return q_02.unknownFields;
    }
}

