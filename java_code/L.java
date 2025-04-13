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

public final class L
extends GeneratedMessageV3
implements O {
    private static final long c = 0L;
    public static final int a = 1;
    volatile Object d;
    public static final int b = 2;
    volatile Object e;
    private byte f = (byte)-1;
    private static final L g = new L();
    static final Parser<L> h = new M();

    L(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private L() {
        this.d = "";
        this.e = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    L(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                String string;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        string = codedInputStream.readStringRequireUtf8();
                        this.d = string;
                        continue block11;
                    }
                    case 18: 
                }
                string = codedInputStream.readStringRequireUtf8();
                this.e = string;
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
        return e_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.d.ensureFieldAccessorsInitialized(L.class, N.class);
    }

    @Override
    public String b() {
        Object object = this.d;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.d = string;
        return string;
    }

    @Override
    public ByteString c() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public String d() {
        Object object = this.e;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.e = string;
        return string;
    }

    @Override
    public ByteString e() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.d);
        }
        if (!this.e().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.e);
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
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.d);
        }
        if (!this.e().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof L)) {
            return super.equals(object);
        }
        L l = (L)object;
        boolean bl = true;
        bl = bl && this.b().equals(l.b());
        bl = bl && this.d().equals(l.d());
        bl = bl && this.unknownFields.equals((Object)l.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + L.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b().hashCode();
        n = 37 * n + 2;
        n = 53 * n + this.d().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static L a(ByteBuffer byteBuffer) {
        return (L)h.parseFrom(byteBuffer);
    }

    public static L a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (L)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static L a(ByteString byteString) {
        return (L)h.parseFrom(byteString);
    }

    public static L a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (L)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static L a(byte[] byArray) {
        return (L)h.parseFrom(byArray);
    }

    public static L a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (L)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static L a(InputStream inputStream) {
        return (L)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static L a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (L)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static L b(InputStream inputStream) {
        return (L)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static L b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (L)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static L a(CodedInputStream codedInputStream) {
        return (L)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static L a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (L)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public N f() {
        return L.g();
    }

    public static N g() {
        return g.h();
    }

    public static N a(L l) {
        return g.h().a(l);
    }

    public N h() {
        return this == g ? new N() : new N().a(this);
    }

    protected N a(GeneratedMessageV3.BuilderParent builderParent) {
        N n = new N(builderParent);
        return n;
    }

    public static L i() {
        return g;
    }

    public static Parser<L> j() {
        return h;
    }

    public Parser<L> getParserForType() {
        return h;
    }

    public L k() {
        return g;
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

    static /* synthetic */ UnknownFieldSet b(L l) {
        return l.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        L.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void c(ByteString byteString) {
        L.checkByteStringIsUtf8((ByteString)byteString);
    }
}

