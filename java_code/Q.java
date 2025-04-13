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

public final class Q
extends GeneratedMessageV3
implements V {
    private static final long d = 0L;
    public static final int a = 1;
    long e;
    public static final int b = 2;
    long f;
    public static final int c = 3;
    int g;
    private byte h = (byte)-1;
    private static final Q i = new Q();
    static final Parser<Q> j = new r_0();

    Q(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Q() {
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Q(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.e = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        this.f = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 24: 
                }
                this.g = n = codedInputStream.readEnum();
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
        return e_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.f.ensureFieldAccessorsInitialized(Q.class, s_0.class);
    }

    @Override
    public long b() {
        return this.e;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public int d() {
        return this.g;
    }

    @Override
    public T e() {
        T t = T.a(this.g);
        return t == null ? T.d : t;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.e != 0L) {
            codedOutputStream.writeInt64(1, this.e);
        }
        if (this.f != 0L) {
            codedOutputStream.writeInt64(2, this.f);
        }
        if (this.g != T.a.getNumber()) {
            codedOutputStream.writeEnum(3, this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.e != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.e);
        }
        if (this.f != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.f);
        }
        if (this.g != T.a.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)3, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Q)) {
            return super.equals(object);
        }
        Q q = (Q)object;
        boolean bl = true;
        bl = bl && this.b() == q.b();
        bl = bl && this.c() == q.c();
        bl = bl && this.g == q.g;
        bl = bl && this.unknownFields.equals((Object)q.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Q.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.c());
        n = 37 * n + 3;
        n = 53 * n + this.g;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Q a(ByteBuffer byteBuffer) {
        return (Q)j.parseFrom(byteBuffer);
    }

    public static Q a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Q)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Q a(ByteString byteString) {
        return (Q)j.parseFrom(byteString);
    }

    public static Q a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Q)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static Q a(byte[] byArray) {
        return (Q)j.parseFrom(byArray);
    }

    public static Q a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Q)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static Q a(InputStream inputStream) {
        return (Q)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static Q a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Q)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Q b(InputStream inputStream) {
        return (Q)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static Q b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Q)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Q a(CodedInputStream codedInputStream) {
        return (Q)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static Q a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Q)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public s_0 f() {
        return Q.g();
    }

    public static s_0 g() {
        return i.h();
    }

    public static s_0 a(Q q) {
        return i.h().a(q);
    }

    public s_0 h() {
        return this == i ? new s_0() : new s_0().a(this);
    }

    protected s_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        s_0 s_02 = new s_0(builderParent);
        return s_02;
    }

    public static Q i() {
        return i;
    }

    public static Parser<Q> j() {
        return j;
    }

    public Parser<Q> getParserForType() {
        return j;
    }

    public Q k() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Q q) {
        return q.unknownFields;
    }
}

