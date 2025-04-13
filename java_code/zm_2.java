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

/*
 * Renamed from zM
 */
public final class zm_2
extends GeneratedMessageV3.Builder<zm_2>
implements zn_2 {
    private int a;
    private int b;
    private int c;
    private List<zg_2> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<zg_2, zi_2, zj_2> e;

    public static final Descriptors.Descriptor a() {
        return zw_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zw_1.b.ensureFieldAccessorsInitialized(zk_2.class, zm_2.class);
    }

    zm_2() {
        this.s();
    }

    zm_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (zk_2.o()) {
            this.u();
        }
    }

    public zm_2 i() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.e.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zw_1.a;
    }

    public zk_2 j() {
        return zk_2.l();
    }

    public zk_2 k() {
        zk_2 zk_22 = this.l();
        if (!zk_22.isInitialized()) {
            throw zm_2.newUninitializedMessageException((Message)zk_22);
        }
        return zk_22;
    }

    public zk_2 l() {
        zk_2 zk_22 = new zk_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        zk_22.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        zk_22.h = this.c;
        if (this.e == null) {
            if ((this.a & 4) == 4) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFB;
            }
            zk_22.i = this.d;
        } else {
            zk_22.i = this.e.build();
        }
        zk_22.f = n2;
        this.onBuilt();
        return zk_22;
    }

    public zm_2 m() {
        return (zm_2)super.clone();
    }

    public zm_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zm_2)super.setField(fieldDescriptor, object);
    }

    public zm_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zm_2)super.clearField(fieldDescriptor);
    }

    public zm_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zm_2)super.clearOneof(oneofDescriptor);
    }

    public zm_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zm_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zm_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zm_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zm_2 a(Message message) {
        if (message instanceof zk_2) {
            return this.a((zk_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zm_2 a(zk_2 zk_22) {
        if (zk_22 == zk_2.l()) {
            return this;
        }
        if (zk_22.b()) {
            this.c(zk_22.c());
        }
        if (zk_22.d()) {
            this.d(zk_22.e());
        }
        if (this.e == null) {
            if (!zk_22.i.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = zk_22.i;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.t();
                    this.d.addAll(zk_22.i);
                }
                this.onChanged();
            }
        } else if (!zk_22.i.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = zk_22.i;
                this.a &= 0xFFFFFFFB;
                this.e = zk_2.p() ? this.u() : null;
            } else {
                this.e.addAllMessages(zk_22.i);
            }
        }
        this.b(zk_2.b(zk_22));
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
        for (int k = 0; k < this.h(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zm_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zk_2 zk_22 = null;
        try {
            zk_22 = (zk_2)zk_2.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zk_22 = (zk_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zk_22 != null) {
                this.a(zk_22);
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

    public zm_2 c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public zm_2 n() {
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
    public int e() {
        return this.c;
    }

    public zm_2 d(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public zm_2 o() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    private void t() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList<zg_2>(this.d);
            this.a |= 4;
        }
    }

    @Override
    public List<zg_2> f() {
        if (this.e == null) {
            return Collections.unmodifiableList(this.d);
        }
        return this.e.getMessageList();
    }

    @Override
    public int h() {
        if (this.e == null) {
            return this.d.size();
        }
        return this.e.getCount();
    }

    @Override
    public zg_2 a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (zg_2)this.e.getMessage(n);
    }

    public zm_2 a(int n, zg_2 zg_22) {
        if (this.e == null) {
            if (zg_22 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.set(n, zg_22);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)zg_22);
        }
        return this;
    }

    public zm_2 a(int n, zi_2 zi_22) {
        if (this.e == null) {
            this.t();
            this.d.set(n, zi_22.t());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)zi_22.t());
        }
        return this;
    }

    public zm_2 a(zg_2 zg_22) {
        if (this.e == null) {
            if (zg_22 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.add(zg_22);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)zg_22);
        }
        return this;
    }

    public zm_2 b(int n, zg_2 zg_22) {
        if (this.e == null) {
            if (zg_22 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.add(n, zg_22);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)zg_22);
        }
        return this;
    }

    public zm_2 a(zi_2 zi_22) {
        if (this.e == null) {
            this.t();
            this.d.add(zi_22.t());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)zi_22.t());
        }
        return this;
    }

    public zm_2 b(int n, zi_2 zi_22) {
        if (this.e == null) {
            this.t();
            this.d.add(n, zi_22.t());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)zi_22.t());
        }
        return this;
    }

    public zm_2 a(Iterable<? extends zg_2> iterable) {
        if (this.e == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public zm_2 p() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public zm_2 e(int n) {
        if (this.e == null) {
            this.t();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public zi_2 f(int n) {
        return (zi_2)this.u().getBuilder(n);
    }

    @Override
    public zj_2 b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (zj_2)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zj_2> g() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public zi_2 q() {
        return (zi_2)this.u().addBuilder((AbstractMessage)zg_2.u());
    }

    public zi_2 g(int n) {
        return (zi_2)this.u().addBuilder(n, (AbstractMessage)zg_2.u());
    }

    public List<zi_2> r() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zg_2, zi_2, zj_2> u() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final zm_2 a(UnknownFieldSet unknownFieldSet) {
        return (zm_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zm_2 b(UnknownFieldSet unknownFieldSet) {
        return (zm_2)super.mergeUnknownFields(unknownFieldSet);
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

