import {describe, it, expect, test} from '@jest/globals';

import {hello} from './main'

// "test" style
test('Greeter should greet', () => {
  expect(hello()).toBe("Hello")
}) 

// "spec" style
describe('Greeter', () => {
    it('should greet', () => {
        expect(hello()).toBe("Hello")
    })
})
