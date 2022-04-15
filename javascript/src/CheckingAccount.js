class CheckingAccount {
    constructor(amount) {
        
    }
    
    balance() {
        throw new TypeError('Not implemented');
    }

    deposit(amount) {
        throw new TypeError('Not implemented');
    }

    withdraw(amount) {
        throw new TypeError('Not implemented');
    }
}

module.exports = CheckingAccount;