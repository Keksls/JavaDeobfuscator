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
 * Renamed from Ao
 */
public final class ao_0
extends GeneratedMessageV3
implements av_0 {
    private static final long c = 0L;
    public static final int a = 1;
    List<ar_0> d;
    private byte e = (byte)-1;
    private static final ao_0 f = new ao_0();
    @Deprecated
    public static final Parser<ao_0> b = new ap_0();

    ao_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ao_0() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ao_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = new ArrayList<ar_0>();
                    bl |= true;
                }
                this.d.add((ar_0)codedInputStream.readMessage(ar_0.c, extensionRegistryLite));
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
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return Am.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Am.b.ensureFieldAccessorsInitialized(ao_0.class, aq_0.class);
    }

    @Override
    public List<ar_0> b() {
        return this.d;
    }

    @Override
    public List<? extends au_0> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public ar_0 a(int n) {
        return this.d.get(n);
    }

    @Override
    public au_0 b(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.d.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.d.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ao_0)) {
            return super.equals(object);
        }
        ao_0 ao_02 = (ao_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(ao_02.b());
        bl = bl && this.unknownFields.equals((Object)ao_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ao_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ao_0 a(ByteBuffer byteBuffer) {
        return (ao_0)b.parseFrom(byteBuffer);
    }

    public static ao_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ao_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ao_0 a(ByteString byteString) {
        return (ao_0)b.parseFrom(byteString);
    }

    public static ao_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ao_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static ao_0 a(byte[] byArray) {
        return (ao_0)b.parseFrom(byArray);
    }

    public static ao_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ao_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static ao_0 a(InputStream inputStream) {
        return (ao_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static ao_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ao_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ao_0 b(InputStream inputStream) {
        return (ao_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static ao_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ao_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ao_0 a(CodedInputStream codedInputStream) {
        return (ao_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static ao_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ao_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public aq_0 e() {
        return ao_0.f();
    }

    public static aq_0 f() {
        return f.g();
    }

    public static aq_0 a(ao_0 ao_02) {
        return f.g().a(ao_02);
    }

    public aq_0 g() {
        return this == f ? new aq_0() : new aq_0().a(this);
    }

    protected aq_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        aq_0 aq_02 = new aq_0(builderParent);
        return aq_02;
    }

    public static ao_0 h() {
        return f;
    }

    public static Parser<ao_0> i() {
        return b;
    }

    public Parser<ao_0> getParserForType() {
        return b;
    }

    public ao_0 j() {
        return f;
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

    static /* synthetic */ UnknownFieldSet b(ao_0 ao_02) {
        return ao_02.unknownFields;
    }
}

