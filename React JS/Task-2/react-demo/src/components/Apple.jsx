import React, { Component } from 'react'

export class Apple extends Component {
  render() {
    const { appleInfo } = this.props;
    const { type, color } = appleInfo;
    
    return (
      <h2>Im a {color} {type} Apple!</h2>
    )
  }
}

export default Apple
