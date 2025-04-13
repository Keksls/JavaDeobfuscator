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

public final class eM
extends GeneratedMessageV3.Builder<eM>
implements eN {
    private int a;
    private int b;
    private Object c = "";
    private int d;
    private int e;
    private boolean f;

    public static final Descriptors.Descriptor a() {
        return eI.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eI.d.ensureFieldAccessorsInitialized(eK.class, eM.class);
    }

    eM() {
        this.w();
    }

    eM(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.w();
    }

    private void w() {
        if (eK.s()) {
            // empty if block
        }
    }

    public eM m() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = false;
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eI.c;
    }

    public eK n() {
        return eK.p();
    }

    public eK o() {
        eK eK2 = this.p();
        if (!eK2.isInitialized()) {
            throw eM.newUninitializedMessageException((Message)eK2);
        }
        return eK2;
    }

    public eK p() {
        eK eK2 = new eK(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        eK2.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        eK2.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        eK2.k = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        eK2.l = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        eK2.m = this.f;
        eK2.h = n2;
        this.onBuilt();
        return eK2;
    }

    public eM q() {
        return (eM)super.clone();
    }

    public eM a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eM)super.setField(fieldDescriptor, object);
    }

    public eM a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eM)super.clearField(fieldDescriptor);
    }

    public eM a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eM)super.clearOneof(oneofDescriptor);
    }

    public eM a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eM)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eM b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eM)super.addRepeatedField(fieldDescriptor, object);
    }

    public eM a(Message message) {
        if (message instanceof eK) {
            return this.a((eK)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eM a(eK eK2) {
        if (eK2 == eK.p()) {
            return this;
        }
        if (eK2.b()) {
            this.a(eK2.c());
        }
        if (eK2.d()) {
            this.a |= 2;
            this.c = eK2.j;
            this.onChanged();
        }
        if (eK2.g()) {
            this.b(eK2.h());
        }
        if (eK2.i()) {
            this.c(eK2.j());
        }
        if (eK2.k()) {
            this.a(eK2.l());
        }
        this.b(eK.b(eK2));
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
        if (!this.g()) {
            return false;
        }
        return this.i();
    }

    public eM a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eK eK2 = null;
        try {
            eK2 = (eK)eK.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eK2 = (eK)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eK2 != null) {
                this.a(eK2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public eM a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public eM r() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eM a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public eM s() {
        this.a &= 0xFFFFFFFD;
        this.c = eK.p().e();
        this.onChanged();
        return this;
    }

    public eM a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public int h() {
        return this.d;
    }

    public eM b(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public eM t() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public int j() {
        return this.e;
    }

    public eM c(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public eM u() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
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

    public eM a(boolean bl) {
        this.a |= 0x10;
        this.f = bl;
        this.onChanged();
        return this;
    }

    public eM v() {
        this.a &= 0xFFFFFFEF;
        this.f = false;
        this.onChanged();
        return this;
    }

    public final eM a(UnknownFieldSet unknownFieldSet) {
        return (eM)super.setUnknownFields(unknownFieldSet);
    }

    public final eM b(UnknownFieldSet unknownFieldSet) {
        return (eM)super.mergeUnknownFields(unknownFieldSet);
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

