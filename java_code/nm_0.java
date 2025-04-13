/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from nM
 */
public final class nm_0
extends GeneratedMessageV3.Builder<nm_0>
implements nn_0 {
    private int a;
    private long b;
    private long c;
    private Object d = "";
    private long e;
    private boolean f;

    public static final Descriptors.Descriptor a() {
        return ne_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ne_0.f.ensureFieldAccessorsInitialized(nk_0.class, nm_0.class);
    }

    nm_0() {
        this.w();
    }

    nm_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.w();
    }

    private void w() {
        if (nk_0.s()) {
            // empty if block
        }
    }

    public nm_0 m() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = 0L;
        this.a &= 0xFFFFFFF7;
        this.f = false;
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ne_0.e;
    }

    public nk_0 n() {
        return nk_0.p();
    }

    public nk_0 o() {
        nk_0 nk_02 = this.p();
        if (!nk_02.isInitialized()) {
            throw nm_0.newUninitializedMessageException((Message)nk_02);
        }
        return nk_02;
    }

    public nk_0 p() {
        nk_0 nk_02 = new nk_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        nk_02.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        nk_02.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        nk_02.k = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        nk_02.l = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        nk_02.m = this.f;
        nk_02.h = n2;
        this.onBuilt();
        return nk_02;
    }

    public nm_0 q() {
        return (nm_0)super.clone();
    }

    public nm_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nm_0)super.setField(fieldDescriptor, object);
    }

    public nm_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nm_0)super.clearField(fieldDescriptor);
    }

    public nm_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nm_0)super.clearOneof(oneofDescriptor);
    }

    public nm_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nm_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nm_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nm_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public nm_0 a(Message message) {
        if (message instanceof nk_0) {
            return this.a((nk_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nm_0 a(nk_0 nk_02) {
        if (nk_02 == nk_0.p()) {
            return this;
        }
        if (nk_02.b()) {
            this.a(nk_02.c());
        }
        if (nk_02.d()) {
            this.b(nk_02.e());
        }
        if (nk_02.f()) {
            this.a |= 4;
            this.d = nk_02.k;
            this.onChanged();
        }
        if (nk_02.i()) {
            this.c(nk_02.j());
        }
        if (nk_02.k()) {
            this.a(nk_02.l());
        }
        this.b(nk_0.b(nk_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (!this.i()) {
            return false;
        }
        return this.k();
    }

    public nm_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nk_0 nk_02 = null;
        try {
            nk_02 = (nk_0)nk_0.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nk_02 = (nk_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nk_02 != null) {
                this.a(nk_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public nm_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public nm_0 r() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public long e() {
        return this.c;
    }

    public nm_0 b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public nm_0 s() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString h() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nm_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public nm_0 t() {
        this.a &= 0xFFFFFFFB;
        this.d = nk_0.p().g();
        this.onChanged();
        return this;
    }

    public nm_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public long j() {
        return this.e;
    }

    public nm_0 c(long l) {
        this.a |= 8;
        this.e = l;
        this.onChanged();
        return this;
    }

    public nm_0 u() {
        this.a &= 0xFFFFFFF7;
        this.e = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public boolean l() {
        return this.f;
    }

    public nm_0 a(boolean bl) {
        this.a |= 0x10;
        this.f = bl;
        this.onChanged();
        return this;
    }

    public nm_0 v() {
        this.a &= 0xFFFFFFEF;
        this.f = false;
        this.onChanged();
        return this;
    }

    public final nm_0 a(UnknownFieldSet unknownFieldSet) {
        return (nm_0)super.setUnknownFields(unknownFieldSet);
    }

    public final nm_0 b(UnknownFieldSet unknownFieldSet) {
        return (nm_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.m();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.q();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.m();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Message buildPartial() {
        return this.p();
    }

    public /* synthetic */ Message build() {
        return this.o();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.p();
    }

    public /* synthetic */ MessageLite build() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Object clone() {
        return this.q();
    }
}

