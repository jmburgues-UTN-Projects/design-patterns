package org.formacion;

public class IMOAdapter implements InternationalMoneyOrganization {
    private BancoNostrum bancoNostrumIml;

    public IMOAdapter(BancoNostrum bancoNostrum){
        this.bancoNostrumIml = bancoNostrum;
    }

    @Override public void transfer(int cantidad, String cliente) {
        this.bancoNostrumIml.movimiento(cliente,cantidad);
    }

    @Override public int state(String cliente) {
        Integer state = this.bancoNostrumIml.estado(cliente);
        return state == null ? 0 : state;
    }
}
