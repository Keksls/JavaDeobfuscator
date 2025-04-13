/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eQ
extends GeneratedMessageV3.Builder<eQ>
implements eR {
    private int a;
    private int b;
    private List<eK> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<eK, eM, eN> d;
    private int e = -2;

    public static final Descriptors.Descriptor a() {
        return eI.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eI.b.ensureFieldAccessorsInitialized(eO.class, eQ.class);
    }

    eQ() {
        this.s();
    }

    eQ(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (eO.o()) {
            this.u();
        }
    }

    public eQ i() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        this.e = -2;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eI.a;
    }

    public eO j() {
        return eO.l();
    }

    public eO k() {
        eO eO2 = this.l();
        if (!eO2.isInitialized()) {
            throw eQ.newUninitializedMessageException((Message)eO2);
        }
        return eO2;
    }

    public eO l() {
        eO eO2 = new eO(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        eO2.g = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            eO2.h = this.c;
        } else {
            eO2.h = this.d.build();
        }
        if ((n & 4) == 4) {
            n2 |= 2;
        }
        eO2.i = this.e;
        eO2.f = n2;
        this.onBuilt();
        return eO2;
    }

    public eQ m() {
        return (eQ)super.clone();
    }

    public eQ a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eQ)super.setField(fieldDescriptor, object);
    }

    public eQ a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eQ)super.clearField(fieldDescriptor);
    }

    public eQ a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eQ)super.clearOneof(oneofDescriptor);
    }

    public eQ a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eQ)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eQ b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eQ)super.addRepeatedField(fieldDescriptor, object);
    }

    public eQ a(Message message) {
        if (message instanceof eO) {
            return this.a((eO)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eQ a(eO eO2) {
        if (eO2 == eO.l()) {
            return this;
        }
        if (eO2.b()) {
            this.c(eO2.c());
        }
        if (this.d == null) {
            if (!eO2.h.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = eO2.h;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.t();
                    this.c.addAll(eO2.h);
                }
                this.onChanged();
            }
        } else if (!eO2.h.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = eO2.h;
                this.a &= 0xFFFFFFFD;
                this.d = eO.p() ? this.u() : null;
            } else {
                this.d.addAllMessages(eO2.h);
            }
        }
        if (eO2.g()) {
            this.g(eO2.h());
        }
        this.b(eO.b(eO2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public eQ a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eO eO2 = null;
        try {
            eO2 = (eO)eO.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eO2 = (eO)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eO2 != null) {
                this.a(eO2);
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

    public eQ c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public eQ n() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void t() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<eK>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<eK> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public eK a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (eK)this.d.getMessage(n);
    }

    public eQ a(int n, eK eK2) {
        if (this.d == null) {
            if (eK2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.c.set(n, eK2);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)eK2);
        }
        return this;
    }

    public eQ a(int n, eM eM2) {
        if (this.d == null) {
            this.t();
            this.c.set(n, eM2.o());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)eM2.o());
        }
        return this;
    }

    public eQ a(eK eK2) {
        if (this.d == null) {
            if (eK2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.c.add(eK2);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)eK2);
        }
        return this;
    }

    public eQ b(int n, eK eK2) {
        if (this.d == null) {
            if (eK2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.c.add(n, eK2);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)eK2);
        }
        return this;
    }

    public eQ a(eM eM2) {
        if (this.d == null) {
            this.t();
            this.c.add(eM2.o());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)eM2.o());
        }
        return this;
    }

    public eQ b(int n, eM eM2) {
        if (this.d == null) {
            this.t();
            this.c.add(n, eM2.o());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)eM2.o());
        }
        return this;
    }

    public eQ a(Iterable<? extends eK> iterable) {
        if (this.d == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public eQ o() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public eQ d(int n) {
        if (this.d == null) {
            this.t();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public eM e(int n) {
        return (eM)this.u().getBuilder(n);
    }

    @Override
    public eN b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (eN)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends eN> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public eM p() {
        return (eM)this.u().addBuilder((AbstractMessage)eK.p());
    }

    public eM f(int n) {
        return (eM)this.u().addBuilder(n, (AbstractMessage)eK.p());
    }

    public List<eM> q() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eK, eM, eN> u() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public int h() {
        return this.e;
    }

    public eQ g(int n) {
        this.a |= 4;
        this.e = n;
        this.onChanged();
        return this;
    }

    public eQ r() {
        this.a &= 0xFFFFFFFB;
        this.e = -2;
        this.onChanged();
        return this;
    }

    public final eQ a(UnknownFieldSet unknownFieldSet) {
        return (eQ)super.setUnknownFields(unknownFieldSet);
    }

    public final eQ b(UnknownFieldSet unknownFieldSet) {
        return (eQ)super.mergeUnknownFields(unknownFieldSet);
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
        return this.i();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.m();
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
        return this.i();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.m();
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
        return this.m();
    }

    public /* synthetic */ Message buildPartial() {
        return this.l();
    }

    public /* synthetic */ Message build() {
        return this.k();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.l();
    }

    public /* synthetic */ MessageLite build() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ Object clone() {
        return this.m();
    }
}

